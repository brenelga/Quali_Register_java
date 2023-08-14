--Galicia Aguilar Jesus Brenel 5123280006
--Hernández Santes Lilia 5123280005
--Murillo Gurrola Luis Felipe 5123280023

--Añadidas las restricciones unique, check y default

Create database qualiregister

Create table coordinador(
id_coor serial Not Null Primary Key,
nombre_coor varchar(50),
ap_pat_coor varchar(50),
ap_mat_coor varchar(50)
);

Create Table asignatura(
id_asig serial Not Null Primary Key,
nombre_asig varchar(75) Not Null unique,
grado int Not Null
);

Create table "carrera"(
id_carrera serial Not Null Primary Key,
nombre_carrera varchar(100) Not Null unique,
coordinador int Not Null,
Foreign Key ("coordinador") references coordinador("id_coor")
);

Create Table docente(
iddoc serial not null primary key,
numero_trabajador bigint Not Null unique,
nombre_docente varchar(50) Not Null,
ap_pat_doc varchar(50) Not Null,
ap_mat_doc varchar(50) Not null,
contrasena varchar(15) Not Null
);

Create Table administrador(
idadmin serial not null primary key,
usuario varchar(30) not null unique,
constrasena_admin varchar (15) not null,
nombre varchar (30) not null,
appat varchar (30) not null,
apmat varchar (30) default (' ')
);

Create Table alumnos(
idalumno serial not null primary key,
matricula bigint not Null unique,
nombre varchar (50) not Null,
apellido_paterno varchar(50) Not Null,
apellido_materno varchar(50) default(' '),
grado int Not Null,
grupo varchar(1) Not Null,
carrera int Not Null,
Foreign Key ("carrera") references "carrera"("id_carrera")
);

Create Table asistencia(
id_Asistencia serial Not Null Primary Key,
matricula bigint Not Null,
fecha Date Not Null default (current_date),
asistencia float Not Null,
asignatura int Not Null,
Foreign Key ("matricula") references "alumnos"("matricula"),
Foreign Key ("asignatura") references "asignatura"("id_asig"),
check (asistencia>=0 and asistencia <=1)
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
calificacion float Not Null,
Foreign Key ("tarea") references "tareas"(id_tarea),
Foreign Key ("matricula") references "alumnos"("matricula"),
Foreign Key ("asignatura") references "asignatura"("id_asig"),
check (calificacion >= 0 and calificacion <= 100)
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
