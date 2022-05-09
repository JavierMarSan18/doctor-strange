--Pacientes
insert into pacientes (primer_nombre_paciente, segundo_nombre_paciente, primer_apellido_paciente,segundo_apellido_paciente,edad_paciente) values ('Jose', 'Javier', 'Marroquin','Sanchez',20);
insert into pacientes (primer_nombre_paciente, segundo_nombre_paciente, primer_apellido_paciente,segundo_apellido_paciente,edad_paciente) values ('Darwin', 'Roberto', 'Marroquin','Sanchez',21);

--Polizas
insert into polizas (id_cliente,estado_poliza, fecha_inicio_poliza,fecha_fin_poliza) values (1,'VIGENTE', '2020-03-26','2025-03-26');
insert into polizas (id_cliente,estado_poliza, fecha_inicio_poliza,fecha_fin_poliza) values (2,'NO VIGENTE', '2011-08-12','2016-08-12');

--Citas
insert into citas (id_poliza, fecha_cita, hora_cita, estado_cita, observacion_cita) values (1,'2022-08-10', '15:00:00', 'PENDIENTE', 'El paciente muestra mejoria.');
insert into citas (id_poliza, fecha_cita, hora_cita, estado_cita, observacion_cita) values (2,'2022-05-26', '15:00:00', 'CANCELADA', 'Aumentar duracion de la cita.');

