USE [master]
GO
/****** Object:  Database [dBSepenipsmer]    Script Date: 19/06/2020 19:34:21 ******/
CREATE DATABASE dBSepenipsmer
 go 

 use dBSepenipsmer
CREATE TABLE [dbo].[Administrador](
	[IdAdmi] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](50) NULL,
	[Contrasena] [varchar](50) NULL,
 CONSTRAINT [PK_Administrador] PRIMARY KEY CLUSTERED 
(
	[IdAdmi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CuestionarioInteligencia]    Script Date: 19/06/2020 19:34:21 ******/

CREATE TABLE [dbo].[CuestionarioInteligencia](
	[IdPregunta] [int] IDENTITY(1,1) NOT NULL,
	[Respuesta] [varchar](50) NULL,
 CONSTRAINT [PK_CuestionarioInteligencia] PRIMARY KEY CLUSTERED 
(
	[IdPregunta] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[EvaluacionesInteligencia](
	[IdEvaluacion] [int] IDENTITY(1,1) NOT NULL,
	[IdPersonal] [int] NOT NULL,
	[Puntaje] [int] NOT NULL,
	[Resultado] [varchar](100) NULL,
	[FechaRealizacion] [date] NOT NULL,
 CONSTRAINT [PK_EvaluacionesInteligencia] PRIMARY KEY CLUSTERED 
(
	[IdEvaluacion] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

CREATE TABLE [dbo].[Personal](
	[IdPersonal] [int] IDENTITY(1,1) NOT NULL,
	[IdAdmi] [int] NOT NULL,
	[Dui] [int] NOT NULL,
	[Nombres] [varchar](60) NULL,
	[Apellidos] [varchar](60) NULL,
	[Sexo] [varchar](50) NULL,
	[Estudios] [varchar](50) NULL,
	[FechaNacimiento] [date] NOT NULL,
	[Telefono] [int] NULL,
	[Celular] [int] NULL,
	[Correo] [varchar](40) NULL,
	[Direccion] [varchar](50) NULL,
 CONSTRAINT [PK_Personal] PRIMARY KEY CLUSTERED 
(
	[IdPersonal] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[EvaluacionesInteligencia]  WITH CHECK ADD  CONSTRAINT [FK_EvaluacionesInteligencia_Personal] FOREIGN KEY([IdPersonal])
REFERENCES [dbo].[Personal] ([IdPersonal])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[EvaluacionesInteligencia] CHECK CONSTRAINT [FK_EvaluacionesInteligencia_Personal]
GO
ALTER TABLE [dbo].[Personal]  WITH CHECK ADD  CONSTRAINT [FK_Personal_Administrador2] FOREIGN KEY([IdAdmi])
REFERENCES [dbo].[Administrador] ([IdAdmi])
GO
ALTER TABLE [dbo].[Personal] CHECK CONSTRAINT [FK_Personal_Administrador2]
GO

