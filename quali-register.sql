--Galicia Aguilar Jesus Brenel 5123280006
--Hernández Santes Lilia 5123280005
--Murillo Gurrola Luis Felipe 5123280023
Create database qualiregister

Create table coordinador(
id_coor serial Not Null Primary Key,
nombre_coor varchar(50),
ap_pat_coor varchar(50),
ap_mat_coor varchar(50)
);

Create Table asignatura(
id_asig serial Not Null Primary Key,
nombre_asig varchar(75) Not Null,
grado int Not Null
);

Create Table docente(
iddoc serial Not Null Primary Key,
numero_trabajador bigint Not Null unique,
nombre_docente varchar(50) Not Null,
ap_pat_doc varchar(50) Not Null,
ap_mat_doc varchar(50) Not null,
contrasena varchar(15) Not Null
);

Create Table administrador(
idadmin serial not Null Primary Key,
usuario varchar(30) not null unique,
nombread varchar(30) not Null,
appat varchar (30) not Null,
appat varchar (30),
constrasena_admin varchar (15) not null
)

Create Table alumnos(
idal serial not Null Primary Key,
matricula bigint not Null unique,
nombre varchar (50) not Null,
apellido_paterno varchar(50) Not Null,
apellido_materno varchar(50),
grado int Not Null,
grupo char Not Null,
carrera int Not Null,
Foreign Key ("carrera") references "carrera"("id_carrera")
);

Create Table asistencia(
id_Asistencia serial Not Null Primary Key,
matricula bigint Not Null,
fecha Date Not Null set default "current_date",
asistencia double Not Null check asistencia >=0 and asistencia<=1,
asignatura int Not Null,
Foreign Key ("matricula") references "alumnos"("matricula"),
Foreign Key ("asignatura") references "asignatura"("id_asig")
);

Create table tareas(
id_tarea serial Not Null Primary Key,
nombre_tarea varchar(35) Not Null,
asignatura int Not Null,
matricula bigint Not Null,
Foreign Key (asignatura) references "asignatura"("id_asig"),
Foreign Key ("matricula") references "alumnos"(matricula)
);

Create table calificacion(
id_calificacion serial Not Null Primary Key,
tarea int Not null,
matricula bigint Not Null,
asignatura int Not Null,
calificacion float Not Null check calificacion <=100,
Foreign Key ("tarea") references "tareas"(id_tarea),
Foreign Key ("matricula") references "alumnos"("matricula"),
Foreign Key ("asignatura") references "asignatura"("id_asig")
);

Create table "carrera"(
id_carrera serial Not Null Primary Key,
nombre_carrera varchar(100) Not Null unique,
coordinador int Not Null unique,
Foreign Key ("coordinador") references coordinador("id_coor")
);

Create table docente_asignatura(
iddoc int Not null,
id_asig int not null,
Foreign key (iddoc) references docente (iddoc),
Foreign Key (id_asig) references asignatura (id_asig)
);

Create Table alumno_materias(
matricula bigint not null,
id_asig int not null,
Foreign Key (matricula) references alumnos (matricula),
Foreign key (id_asig) references asignatura (id_asig)
);


