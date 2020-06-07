--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2
-- Dumped by pg_dump version 12.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: maps; Type: SCHEMA; Schema: -; Owner: postgres
--

SET default_tablespace = '';

SET default_table_access_method = heap;



CREATE TABLE maps.locations (
    id integer PRIMARY KEY,
    dogId integer NOT NULL,
    lat text NOT NULL,
    lng text NOT NULL
);