USE [master]
GO
/****** Object:  Database [dBSepenipsmer]    Script Date: 19/06/2020 19:34:21 ******/
CREATE DATABASE [dBSepenipsmer]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'dBSepenipsmer', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\dBSepenipsmer.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'dBSepenipsmer_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\dBSepenipsmer_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [dBSepenipsmer] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [dBSepenipsmer].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [dBSepenipsmer] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET ARITHABORT OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [dBSepenipsmer] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [dBSepenipsmer] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET  DISABLE_BROKER 
GO
ALTER DATABASE [dBSepenipsmer] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [dBSepenipsmer] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [dBSepenipsmer] SET  MULTI_USER 
GO
ALTER DATABASE [dBSepenipsmer] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [dBSepenipsmer] SET DB_CHAINING OFF 
GO
ALTER DATABASE [dBSepenipsmer] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [dBSepenipsmer] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [dBSepenipsmer] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [dBSepenipsmer] SET QUERY_STORE = OFF
GO
USE [dBSepenipsmer]
GO
/****** Object:  Table [dbo].[Administrador]    Script Date: 19/06/2020 19:34:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
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
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CuestionarioInteligencia](
	[IdPregunta] [int] IDENTITY(1,1) NOT NULL,
	[Respuesta] [varchar](50) NULL,
 CONSTRAINT [PK_CuestionarioInteligencia] PRIMARY KEY CLUSTERED 
(
	[IdPregunta] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[EvaluacionesInteligencia]    Script Date: 19/06/2020 19:34:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
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
GO
/****** Object:  Table [dbo].[Personal]    Script Date: 19/06/2020 19:34:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
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
USE [master]
GO
ALTER DATABASE [dBSepenipsmer] SET  READ_WRITE 
GO
