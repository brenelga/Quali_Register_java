--Galicia Aguilar Jesus Brenel 5123280006
--Hernández Santes Lilia 5123280005
--Murillo Gurrola Luis Felipe 5123280023
Create database qualiregister

Create table coordinador(
id_coor int Not Null Primary Key,
nombre_coor varchar(50),
ap_pat_coor varchar(50),
ap_mat_coor varchar(50)
);

Create Table asignatura(
id_asig int Not Null Primary Key,
nombre_asig varchar(75) Not Null,
grado int Not Null
);

Create Table docente(
numero_trabajador bigint Not Null Primary Key,
nombre_docente varchar(50) Not Null,
ap_pat_doc varchar(50) Not Null,
ap_mat_doc varchar(50) Not null,
contrasena varchar(15) Not Null
);

Create Table administrador(
usuario varchar(30) not null Primary Key,
constrasena_admin varchar (15) not null
)

Create Table alumnos(
matricula bigint not Null Primary Key,
nombre varchar (50) not Null,
apellido_paterno varchar(50) Not Null,
apellido_materno varchar(50),
grado int Not Null,
grupo char Not Null,
carrera int Not Null,
Foreign Key ("carrera") references "carrera"("id_carrera")
);

Create Table asistencia(
id_Asistencia int Not Null Primary Key,
matricula bigint Not Null,
fecha Date Not Null,
asistencia Bool Not Null,
asignatura int Not Null,
Foreign Key ("matricula") references "alumnos"("matricula"),
Foreign Key ("asignatura") references "asignatura"("id_asig")
);

Create table tareas(
id_tarea int Not Null Primary Key,
nombre_tarea varchar(35) Not Null,
asignatura int Not Null,
matricula bigint Not Null,
Foreign Key (asignatura) references "asignatura"("id_asig"),
Foreign Key ("matricula") references "alumnos"(matricula)
);

Create table calificacion(
id_calificacion int Not Null Primary Key,
tarea int Not null,
matricula bigint Not Null,
asignatura int Not Null,
calificacion float Not Null,
Foreign Key ("tarea") references "tareas"(id_tarea),
Foreign Key ("matricula") references "alumnos"("matricula"),
Foreign Key ("asignatura") references "asignatura"("id_asig")
);

Create table "carrera"(
id_carrera int Not Null Primary Key,
nombre_carrera varchar(100) Not Null,
coordinador int Not Null,
Foreign Key ("coordinador") references coordinador("id_coor")
);

Create table docente_asignatura(
numero_trabajador bigint Not null,
id_asig int not null,
Foreign key (numero_trabajador) references docente (numero_trabajador),
Foreign Key (id_asig) references asignatura (id_asig)
);

Create Table alumno_materias(
matricula bigint not null,
id_asig int not null,
Foreign Key (matricula) references alumnos (matricula),
Foreign key (id_asig) references asignatura (id_asig)
);

Alter table administrador ADD nombre varchar(50) Not Null;
Alter table administrador ADD apellido_pat varchar(50) Not Null;
Alter table administrador ADD apellido_mat varchar(50);