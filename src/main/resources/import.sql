--Pacientes
insert into pacientes (primer_nombre_paciente, segundo_nombre_paciente, primer_apellido_paciente,segundo_apellido_paciente,edad_paciente) values ('Jose', 'Javier', 'Marroquin','Sanchez',20);
--Polizas
insert into polizas (id_paciente,estado_poliza, fecha_inicio_poliza,fecha_fin_poliza) values (1,'VIGENTE', '2020-03-26','2025-03-26');
--Citas
insert into citas (id_poliza, fecha_cita, hora_cita, estado_cita, observacion_cita) values (1,'2022-08-10', '15:00:00', 'PENDIENTE', 'El paciente muestra mejoria.');

