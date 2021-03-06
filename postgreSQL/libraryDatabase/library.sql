PGDMP     +    4                w            library    10.8    10.8 (               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false                       1262    24683    library    DATABASE     �   CREATE DATABASE library WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE library;
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false                       0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false                       0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    24710    author    TABLE     a   CREATE TABLE public.author (
    id bigint NOT NULL,
    name character varying(100) NOT NULL
);
    DROP TABLE public.author;
       public         postgres    false    3            �            1259    24708    author_id_seq    SEQUENCE     v   CREATE SEQUENCE public.author_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.author_id_seq;
       public       postgres    false    3    199                       0    0    author_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.author_id_seq OWNED BY public.author.id;
            public       postgres    false    198            �            1259    24702    library_item    TABLE     �   CREATE TABLE public.library_item (
    id bigint NOT NULL,
    title character varying(100) NOT NULL,
    type character varying(10) NOT NULL,
    author_id bigint,
    isbn character varying(20),
    publish_date date
);
     DROP TABLE public.library_item;
       public         postgres    false    3            �            1259    24700    library_item_id_seq    SEQUENCE     |   CREATE SEQUENCE public.library_item_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.library_item_id_seq;
       public       postgres    false    197    3                       0    0    library_item_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.library_item_id_seq OWNED BY public.library_item.id;
            public       postgres    false    196            �            1259    24723    rack    TABLE     ^   CREATE TABLE public.rack (
    id bigint NOT NULL,
    code character varying(20) NOT NULL
);
    DROP TABLE public.rack;
       public         postgres    false    3            �            1259    24721    rack_id_seq    SEQUENCE     t   CREATE SEQUENCE public.rack_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.rack_id_seq;
       public       postgres    false    3    201                       0    0    rack_id_seq    SEQUENCE OWNED BY     ;   ALTER SEQUENCE public.rack_id_seq OWNED BY public.rack.id;
            public       postgres    false    200            �            1259    24731 	   rack_item    TABLE     �   CREATE TABLE public.rack_item (
    id bigint NOT NULL,
    rack_id bigint NOT NULL,
    library_item_id bigint NOT NULL,
    quantity integer NOT NULL
);
    DROP TABLE public.rack_item;
       public         postgres    false    3            �            1259    24729    rack_item_id_seq    SEQUENCE     y   CREATE SEQUENCE public.rack_item_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.rack_item_id_seq;
       public       postgres    false    203    3                       0    0    rack_item_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.rack_item_id_seq OWNED BY public.rack_item.id;
            public       postgres    false    202            �
           2604    24713 	   author id    DEFAULT     f   ALTER TABLE ONLY public.author ALTER COLUMN id SET DEFAULT nextval('public.author_id_seq'::regclass);
 8   ALTER TABLE public.author ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    198    199    199            �
           2604    24705    library_item id    DEFAULT     r   ALTER TABLE ONLY public.library_item ALTER COLUMN id SET DEFAULT nextval('public.library_item_id_seq'::regclass);
 >   ALTER TABLE public.library_item ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    197    196    197            �
           2604    24726    rack id    DEFAULT     b   ALTER TABLE ONLY public.rack ALTER COLUMN id SET DEFAULT nextval('public.rack_id_seq'::regclass);
 6   ALTER TABLE public.rack ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    200    201    201            �
           2604    24734    rack_item id    DEFAULT     l   ALTER TABLE ONLY public.rack_item ALTER COLUMN id SET DEFAULT nextval('public.rack_item_id_seq'::regclass);
 ;   ALTER TABLE public.rack_item ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    203    202    203                      0    24710    author 
   TABLE DATA               *   COPY public.author (id, name) FROM stdin;
    public       postgres    false    199   �(       
          0    24702    library_item 
   TABLE DATA               V   COPY public.library_item (id, title, type, author_id, isbn, publish_date) FROM stdin;
    public       postgres    false    197   �(                 0    24723    rack 
   TABLE DATA               (   COPY public.rack (id, code) FROM stdin;
    public       postgres    false    201   �)                 0    24731 	   rack_item 
   TABLE DATA               K   COPY public.rack_item (id, rack_id, library_item_id, quantity) FROM stdin;
    public       postgres    false    203   �)                  0    0    author_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.author_id_seq', 2, true);
            public       postgres    false    198                       0    0    library_item_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.library_item_id_seq', 5, true);
            public       postgres    false    196                       0    0    rack_id_seq    SEQUENCE SET     9   SELECT pg_catalog.setval('public.rack_id_seq', 3, true);
            public       postgres    false    200                        0    0    rack_item_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.rack_item_id_seq', 5, true);
            public       postgres    false    202            �
           2606    24715    author author_pk 
   CONSTRAINT     N   ALTER TABLE ONLY public.author
    ADD CONSTRAINT author_pk PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.author DROP CONSTRAINT author_pk;
       public         postgres    false    199            �
           2606    24707    library_item library_item_pk 
   CONSTRAINT     Z   ALTER TABLE ONLY public.library_item
    ADD CONSTRAINT library_item_pk PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.library_item DROP CONSTRAINT library_item_pk;
       public         postgres    false    197            �
           2606    24736    rack_item rack_item_pk 
   CONSTRAINT     T   ALTER TABLE ONLY public.rack_item
    ADD CONSTRAINT rack_item_pk PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.rack_item DROP CONSTRAINT rack_item_pk;
       public         postgres    false    203            �
           2606    24728    rack rack_pk 
   CONSTRAINT     J   ALTER TABLE ONLY public.rack
    ADD CONSTRAINT rack_pk PRIMARY KEY (id);
 6   ALTER TABLE ONLY public.rack DROP CONSTRAINT rack_pk;
       public         postgres    false    201            �
           1259    24751 (   rack_item_rack_id_library_item_id_uindex    INDEX     y   CREATE UNIQUE INDEX rack_item_rack_id_library_item_id_uindex ON public.rack_item USING btree (rack_id, library_item_id);
 <   DROP INDEX public.rack_item_rack_id_library_item_id_uindex;
       public         postgres    false    203    203            �
           2606    24716 &   library_item library_item_author_id_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.library_item
    ADD CONSTRAINT library_item_author_id_fk FOREIGN KEY (author_id) REFERENCES public.author(id);
 P   ALTER TABLE ONLY public.library_item DROP CONSTRAINT library_item_author_id_fk;
       public       postgres    false    2695    199    197            �
           2606    24737 &   rack_item rack_item_library_item_id_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.rack_item
    ADD CONSTRAINT rack_item_library_item_id_fk FOREIGN KEY (library_item_id) REFERENCES public.library_item(id);
 P   ALTER TABLE ONLY public.rack_item DROP CONSTRAINT rack_item_library_item_id_fk;
       public       postgres    false    203    197    2693            �
           2606    24742    rack_item rack_item_rack_id_fk    FK CONSTRAINT     |   ALTER TABLE ONLY public.rack_item
    ADD CONSTRAINT rack_item_rack_id_fk FOREIGN KEY (rack_id) REFERENCES public.rack(id);
 H   ALTER TABLE ONLY public.rack_item DROP CONSTRAINT rack_item_rack_id_fk;
       public       postgres    false    203    201    2697                   x�3��JL�Vp+�I��2r�R��=... ��U      
   �   x�}��
�@E�o�����gFg��H(�Z�y�C������)Z��,.��-�'���0܀��҉͔!�Z(�BB��ǌ�+7�P�n���K�*3$M�Y��.�sx��_�wX<Ș,���
_�(&�����Ҥ�ѐ�����+.��!�zUAT         #   x�3���/*��50�2�1���9��K!�1z\\\ ø	L         +   x�3�4B#.#�i�e$�9M�L��)�!�)������� {T     