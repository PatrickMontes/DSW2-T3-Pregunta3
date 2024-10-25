#DROP DATABASE T3DSW;

CREATE DATABASE T3DSW;
USE T3DSW;


/*--PRIMER PROCESO--*/
CREATE TABLE Estudiante (
                            id INT(10) PRIMARY KEY,
                            nombre VARCHAR(100),
                            apellido VARCHAR(100),
                            email VARCHAR(100),
                            telefono VARCHAR(15),
                            ciclo_academico VARCHAR(10)
);

CREATE TABLE Curso (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       nombre VARCHAR(100),
                       creditos INT,
                       ciclo_academico VARCHAR(10)
);

CREATE TABLE Matricula (
                           id INT PRIMARY KEY AUTO_INCREMENT,
                           id_estudiante INT,
                           id_curso INT,
                           fecha_matricula DATETIME DEFAULT CURRENT_TIMESTAMP,
                           estado VARCHAR(20) CHECK (estado IN ('Activa', 'Cancelada')),
                           FOREIGN KEY (id_estudiante) REFERENCES Estudiante(id),
                           FOREIGN KEY (id_curso) REFERENCES Curso(id)
);


/*--SEGUNDO PROCESO--*/
#Tabla Estudiante

CREATE TABLE Pago (
                      id INT PRIMARY KEY AUTO_INCREMENT,
                      id_estudiante INT,
                      fecha_pago DATE,
                      monto DECIMAL(10, 2),
                      estado VARCHAR(20) CHECK (estado IN ('Pendiente', 'Pagado', 'Vencido')),
                      FOREIGN KEY (id_estudiante) REFERENCES Estudiante(id)
);

CREATE TABLE Detalle_Pago (
                              id INT PRIMARY KEY AUTO_INCREMENT,
                              id_pago INT,
                              monto DECIMAL(10, 2),
                              FOREIGN KEY (id_pago) REFERENCES Pago(id)
);


/*--TERCER PROCESO--*/
#Tabla Estudiante
#Tabla Curso
CREATE TABLE Asistencia (
                            id INT PRIMARY KEY AUTO_INCREMENT,
                            id_estudiante INT,
                            id_curso INT,
                            fecha DATE,
                            estado VARCHAR(20) CHECK (estado IN ('Presente', 'Ausente', 'Justificado')),
                            FOREIGN KEY (id_estudiante) REFERENCES Estudiante(id),
                            FOREIGN KEY (id_curso) REFERENCES Curso(id)
);


INSERT INTO Estudiante (id, nombre, apellido, email, telefono, ciclo_academico) VALUES
                                                                                    (1, 'Juan', 'Pérez', 'juan.perez@upc.com', '1234567890', '2023-1'),
                                                                                    (2, 'Ana', 'Gómez', 'ana.gomez@upc.com', '0987654321', '2023-2'),
                                                                                    (3, 'Luis', 'Martínez', 'luis.martinez@upc.com', '1122334455', '2024-1');

INSERT INTO Curso (nombre, creditos, ciclo_academico) VALUES
                                                          ('Matemáticas', 4, '2023-1'),
                                                          ('Programación', 3, '2023-2'),
                                                          ('Bases de Datos', 3, '2024-1');
