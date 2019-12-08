CREATE TABLE IF NOT EXISTS proprieta ( 
	key text PRIMARY KEY, 
	value text NOT NULL );
CREATE TABLE IF NOT EXISTS versione_tabella ( 
	name text PRIMARY KEY, 
	data_versione datetime NOT NULL );
CREATE TABLE IF NOT EXISTS font (
	id integer PRIMARY KEY, 
	name text NOT NULL,
	font text NOT NULL, 
	size integer NOT NULL, 
	bold integer NOT NULL, 
	italic integer NOT NULL, 
	underlined integer NOT NULL, 
	strike_through integer NOT NULL ); 
CREATE TABLE IF NOT EXISTS box (
	id integer PRIMARY KEY,
	name text NOT NULL,
	padding integer NOT NULL,
	line_width real NOT NULL,
	line_style text NOT NULL,
	line_color text NOT NULL );
CREATE TABLE IF NOT EXISTS immagine (
	id integer PRIMARY KEY, 
	nome text NOT NULL, 
	data_importazione datetime NOT NULL, 
	immagine BLOB NOT NULL );
CREATE TABLE IF NOT EXISTS gruppo ( 
	id integer PRIMARY KEY, 
	nome text NOT NULL, 
	descrizione text );
CREATE TABLE IF NOT EXISTS gruppo_testo_statico ( 
	id integer PRIMARY KEY, 
	id_gruppo integer NOT NULL, 
	id_font integer NOT NULL, 
	id_box integer,
	testo text NOT NULL, 
	x integer NOT NULL, 
	y integer NOT NULL, 
	h integer NOT NULL, 
	w integer NOT NULL,
	box integer NOT NULL );
CREATE TABLE IF NOT EXISTS gruppo_testo_dinamico ( 
	id integer PRIMARY KEY, 
	id_gruppo integer NOT NULL, 
	id_font integer NOT NULL, 
	id_box integer,
	espressione text NOT NULL, 
	x integer NOT NULL, 
	y integer NOT NULL, 
	h integer NOT NULL, 
	w integer NOT NULL,
	box integer NOT NULL );
CREATE TABLE IF NOT EXISTS gruppo_immagine ( 
	id integer PRIMARY KEY, 
	id_gruppo integer NOT NULL, 
	id_immagine NOT NULL, 
	x integer NOT NULL, 
	y integer NOT NULL, 
	h integer NOT NULL, 
	w integer NOT NULL,
	box integer NOT NULL );
CREATE TABLE IF NOT EXISTS scheda ( 
	id integer PRIMARY KEY, 
	nome text NOT NULL, 
	descrizione text );
CREATE TABLE IF NOT EXISTS scheda_testo_statico ( 
	id integer PRIMARY KEY, 
	id_scheda integer NOT NULL, 
	id_font integer NOT NULL, 
	id_box integer,
	testo text NOT NULL, 
	x integer NOT NULL, 
	y integer NOT NULL, 
	h integer NOT NULL, 
	w integer NOT NULL,
	box integer NOT NULL );
CREATE TABLE IF NOT EXISTS scheda_testo_dinamico ( 
	id integer PRIMARY KEY, 
	id_scheda integer NOT NULL, 
	id_font integer NOT NULL, 
	id_box integer,
	espressione text NOT NULL, 
	x integer NOT NULL, 
	y integer NOT NULL, 
	h integer NOT NULL, 
	w integer NOT NULL,
	box integer NOT NULL );
CREATE TABLE IF NOT EXISTS scheda_immagine ( 
	id integer PRIMARY KEY, 
	id_scheda integer NOT NULL, 
	id_immagine NOT NULL, 
	x integer NOT NULL, 
	y integer NOT NULL, 
	h integer NOT NULL, 
	w integer NOT NULL,
	box integer NOT NULL );