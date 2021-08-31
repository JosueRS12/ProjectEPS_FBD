select * from medico;
select * from categoria;
select * from agenda;
select * from sede;
select * from consultorio;
select * from especialidad;
select * from historiaclinica;
select * from cita; 
select * from paciente;
select * from usuario;
select * from eps;
select * from medico_especialidad;
---Sede

insert into sede values (1,'Hospital Cardiovascular','Cll 2 # 54-34',8763473);
insert into sede values (2,'Hospital Hells Pass','Kr 34 #58-78',8763477);
insert into sede values (3,'Hospital Hospital Palermo','Kr 102 #12-34',8763475);

-----Consultorio
insert into consultorio values (101,001,'8:00:00');
insert into consultorio values (102,001,'6:00:00');
insert into consultorio values (103,001,'6:00:00');
insert into consultorio values (201,001,'10:00:00');
insert into consultorio values (202,001,'6:00:00');
insert into consultorio values (101,002,'8:00:00');
insert into consultorio values (102,002,'6:00:00');
insert into consultorio values (103,002,'6:00:00');
insert into consultorio values (201,002,'10:00:00');
insert into consultorio values (202,002,'6:00:00');
insert into consultorio values (101,003,'8:00:00');
insert into consultorio values (102,003,'6:00:00');
insert into consultorio values (103,003,'6:00:00');
insert into consultorio values (201,003,'10:00:00');
insert into consultorio values (202,003,'6:00:00');

---Medico
insert into medico values('ASDSV832478493',103654736,101,001,'CC');
insert into medico values('SHDGD832234535',923457836,101,002,'CC');
insert into medico values('FEBHD832474754',653653353,101,003,'CC');
insert into medico values('AGHJF832476548',732364736,201,001,'CC');

---------Agenda
insert into agenda values(10001,7,103654736,2020,'CC','A');
insert into agenda values(10002,7,923457836,2020,'CC','A');
insert into agenda values(10003,7,653653353,2020,'CC','A');
insert into agenda values(10004,7,732364736,2020,'CC','A');

---Especialidades
insert into especialidad values (1001,'Medicina general');
insert into especialidad values (1002,'Odontologia');
insert into especialidad values (1003,'Oftalmologia');
insert into especialidad values (1004,'Pediatria');

---med_esp
insert into medico_especialidad values (103654736,'CC',1001);
insert into medico_especialidad values (923457836,'CC',1004);
insert into medico_especialidad values (653653353,'CC',1003);
insert into medico_especialidad values (732364736,'CC',1002);

----Categorias
--insert into categoria values(1,10000,'A');
--insert into categoria (2,15000,'B');
--insert into categoria values(3,17500,'C');
----Hist.Clinica
insert into historiaclinica values (1000001,'Acetaminofen 500mg','Paciente sano',100001);
insert into historiaclinica values (1000002,'Ritalin 200mg','Paciente sano',100002);
insert into historiaclinica values (1000003,'Ritalin 200mg','Paciente sano',100002);
insert into historiaclinica values (1000004,'ADED','Paciente mal',100003);

----Citas
select * from cita;
insert into cita(k_numerocita,i_estado,i_horainicio,f_fecha,i_tipocita,k_idagenda) 
values(100005,'I','16:00:00','2020/09/21','prioritaria',10001);
insert into cita(k_numerocita,i_estado,i_horainicio,f_fecha,i_tipocita,k_idagenda) 
values(100002,'I','9:00:00','2020/08/21','prioritaria',10003);
insert into cita(k_numerocita,i_estado,i_horainicio,f_fecha,i_tipocita,k_idagenda) 
values(100003,'I','12:00:00','2020/12/13','prioritaria',10001);
insert into cita(k_numerocita,i_estado,i_horainicio,f_fecha,i_tipocita,k_idagenda) 
values(100004,'I','6:00:00','2020/09/09','prioritaria',10002);
insert into cita values(100001,'A',10000,'10:00:00','2020/08/30','prioritaria',10001,324767829,'CC',1000001);

select * from cita; 
-----Paciente
insert into paciente values('A','Afiliado',324767829,'CC',1);
---EPS
insert into eps values('000001');
----Usuario
insert into usuario values(103654736,'M','Chapatin','Colorado','nocontabanconmiastucia@hotmail.com','CC','1967/09/23',1);
insert into usuario values(923457836,'M','Mota','Rolando','motroll@gmail.com','CC','1970/02/12',1);
insert into usuario values(653653353,'F','Maria','Ruiz','mari@hotmail.com','CC','1986/10/03',1);
insert into usuario values(732364736,'F','Fernanda','Perez','ferpe@hotmail.com','CC','1965/07/13',1);


-------telefonoUsuario

insert into telefonousuario values(103654736,3001231231,'CC');
insert into telefonousuario values(653653353,12363123,'CC');
insert into telefonousuario values(923457836,12463458,'CC');
insert into telefonousuario values(732364736,34563123,'CC');

SELECT f_fecha, i_tipocita,n_nombres from cita,usuario,agenda 
where cita.k_numdocumento = 324767829
                            and usuario.k_numdocumento = agenda.k_numdocumento
							and agenda.k_idagenda=cita.k_idagenda;
