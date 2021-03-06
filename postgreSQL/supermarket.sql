PGDMP              	            w            supermarket    10.8    10.8 :    1           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            2           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            3           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            4           1262    16393    supermarket    DATABASE     �   CREATE DATABASE supermarket WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE supermarket;
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            5           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            6           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16398    brand    TABLE     �   CREATE TABLE public.brand (
    id bigint NOT NULL,
    name character varying(50) NOT NULL,
    product_type character varying(100)
);
    DROP TABLE public.brand;
       public         postgres    false    3            �            1259    16396    brand_id_seq    SEQUENCE     u   CREATE SEQUENCE public.brand_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.brand_id_seq;
       public       postgres    false    197    3            7           0    0    brand_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.brand_id_seq OWNED BY public.brand.id;
            public       postgres    false    196            �            1259    16439    person    TABLE     �   CREATE TABLE public.person (
    id bigint NOT NULL,
    name character varying(200) NOT NULL,
    type character varying(20) NOT NULL
);
    DROP TABLE public.person;
       public         postgres    false    3            �            1259    16442    person_id_seq    SEQUENCE     v   CREATE SEQUENCE public.person_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.person_id_seq;
       public       postgres    false    3    204            8           0    0    person_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.person_id_seq OWNED BY public.person.id;
            public       postgres    false    205            �            1259    16433    producer    TABLE     �   CREATE TABLE public.producer (
    id bigint NOT NULL,
    name character varying(100) NOT NULL,
    phone_number character varying(50)
);
    DROP TABLE public.producer;
       public         postgres    false    3            �            1259    16431    producer_id_seq    SEQUENCE     x   CREATE SEQUENCE public.producer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.producer_id_seq;
       public       postgres    false    3    203            9           0    0    producer_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.producer_id_seq OWNED BY public.producer.id;
            public       postgres    false    202            �            1259    16406    product    TABLE     �   CREATE TABLE public.product (
    id bigint NOT NULL,
    brand_id bigint,
    name character varying(100) NOT NULL,
    price numeric(20,2) NOT NULL
);
    DROP TABLE public.product;
       public         postgres    false    3            �            1259    16404    product_id_seq    SEQUENCE     w   CREATE SEQUENCE public.product_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.product_id_seq;
       public       postgres    false    3    199            :           0    0    product_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.product_id_seq OWNED BY public.product.id;
            public       postgres    false    198            �            1259    16419    supplier    TABLE     �   CREATE TABLE public.supplier (
    id bigint NOT NULL,
    name character varying(100) NOT NULL,
    phone_number character varying(50)
);
    DROP TABLE public.supplier;
       public         postgres    false    3            �            1259    16417    supplier_id_seq    SEQUENCE     x   CREATE SEQUENCE public.supplier_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.supplier_id_seq;
       public       postgres    false    3    201            ;           0    0    supplier_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.supplier_id_seq OWNED BY public.supplier.id;
            public       postgres    false    200            �            1259    16452    transaction    TABLE     �   CREATE TABLE public.transaction (
    id bigint NOT NULL,
    date timestamp without time zone NOT NULL,
    remark character varying(255)
);
    DROP TABLE public.transaction;
       public         postgres    false    3            �            1259    16460    transaction_detail    TABLE     �   CREATE TABLE public.transaction_detail (
    id bigint NOT NULL,
    transaction_id bigint NOT NULL,
    product_id bigint NOT NULL,
    quantity integer NOT NULL
);
 &   DROP TABLE public.transaction_detail;
       public         postgres    false    3            �            1259    16458    transaction_detail_id_seq    SEQUENCE     �   CREATE SEQUENCE public.transaction_detail_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.transaction_detail_id_seq;
       public       postgres    false    209    3            <           0    0    transaction_detail_id_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.transaction_detail_id_seq OWNED BY public.transaction_detail.id;
            public       postgres    false    208            �            1259    16450    transaction_id_seq    SEQUENCE     {   CREATE SEQUENCE public.transaction_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.transaction_id_seq;
       public       postgres    false    207    3            =           0    0    transaction_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.transaction_id_seq OWNED BY public.transaction.id;
            public       postgres    false    206            �
           2604    16401    brand id    DEFAULT     d   ALTER TABLE ONLY public.brand ALTER COLUMN id SET DEFAULT nextval('public.brand_id_seq'::regclass);
 7   ALTER TABLE public.brand ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    196    197    197            �
           2604    16444 	   person id    DEFAULT     f   ALTER TABLE ONLY public.person ALTER COLUMN id SET DEFAULT nextval('public.person_id_seq'::regclass);
 8   ALTER TABLE public.person ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    205    204            �
           2604    16436    producer id    DEFAULT     j   ALTER TABLE ONLY public.producer ALTER COLUMN id SET DEFAULT nextval('public.producer_id_seq'::regclass);
 :   ALTER TABLE public.producer ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    203    202    203            �
           2604    16409 
   product id    DEFAULT     h   ALTER TABLE ONLY public.product ALTER COLUMN id SET DEFAULT nextval('public.product_id_seq'::regclass);
 9   ALTER TABLE public.product ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    199    198    199            �
           2604    16422    supplier id    DEFAULT     j   ALTER TABLE ONLY public.supplier ALTER COLUMN id SET DEFAULT nextval('public.supplier_id_seq'::regclass);
 :   ALTER TABLE public.supplier ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    201    200    201            �
           2604    16455    transaction id    DEFAULT     p   ALTER TABLE ONLY public.transaction ALTER COLUMN id SET DEFAULT nextval('public.transaction_id_seq'::regclass);
 =   ALTER TABLE public.transaction ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    206    207    207            �
           2604    16463    transaction_detail id    DEFAULT     ~   ALTER TABLE ONLY public.transaction_detail ALTER COLUMN id SET DEFAULT nextval('public.transaction_detail_id_seq'::regclass);
 D   ALTER TABLE public.transaction_detail ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    208    209    209            "          0    16398    brand 
   TABLE DATA               7   COPY public.brand (id, name, product_type) FROM stdin;
    public       postgres    false    197   6:       )          0    16439    person 
   TABLE DATA               0   COPY public.person (id, name, type) FROM stdin;
    public       postgres    false    204   p:       (          0    16433    producer 
   TABLE DATA               :   COPY public.producer (id, name, phone_number) FROM stdin;
    public       postgres    false    203   �:       $          0    16406    product 
   TABLE DATA               <   COPY public.product (id, brand_id, name, price) FROM stdin;
    public       postgres    false    199   �:       &          0    16419    supplier 
   TABLE DATA               :   COPY public.supplier (id, name, phone_number) FROM stdin;
    public       postgres    false    201   !;       ,          0    16452    transaction 
   TABLE DATA               7   COPY public.transaction (id, date, remark) FROM stdin;
    public       postgres    false    207   a;       .          0    16460    transaction_detail 
   TABLE DATA               V   COPY public.transaction_detail (id, transaction_id, product_id, quantity) FROM stdin;
    public       postgres    false    209   ~;       >           0    0    brand_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.brand_id_seq', 2, true);
            public       postgres    false    196            ?           0    0    person_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.person_id_seq', 1, false);
            public       postgres    false    205            @           0    0    producer_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.producer_id_seq', 1, true);
            public       postgres    false    202            A           0    0    product_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.product_id_seq', 2, true);
            public       postgres    false    198            B           0    0    supplier_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.supplier_id_seq', 1, true);
            public       postgres    false    200            C           0    0    transaction_detail_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.transaction_detail_id_seq', 1, false);
            public       postgres    false    208            D           0    0    transaction_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.transaction_id_seq', 1, false);
            public       postgres    false    206            �
           2606    16403    brand brand_pk 
   CONSTRAINT     L   ALTER TABLE ONLY public.brand
    ADD CONSTRAINT brand_pk PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.brand DROP CONSTRAINT brand_pk;
       public         postgres    false    197            �
           2606    16449    person person_pk 
   CONSTRAINT     N   ALTER TABLE ONLY public.person
    ADD CONSTRAINT person_pk PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.person DROP CONSTRAINT person_pk;
       public         postgres    false    204            �
           2606    16438    producer producer_pk 
   CONSTRAINT     R   ALTER TABLE ONLY public.producer
    ADD CONSTRAINT producer_pk PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.producer DROP CONSTRAINT producer_pk;
       public         postgres    false    203            �
           2606    16411    product product_pk 
   CONSTRAINT     P   ALTER TABLE ONLY public.product
    ADD CONSTRAINT product_pk PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.product DROP CONSTRAINT product_pk;
       public         postgres    false    199            �
           2606    16424    supplier supplier_pk 
   CONSTRAINT     R   ALTER TABLE ONLY public.supplier
    ADD CONSTRAINT supplier_pk PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.supplier DROP CONSTRAINT supplier_pk;
       public         postgres    false    201            �
           2606    16465 (   transaction_detail transaction_detail_pk 
   CONSTRAINT     f   ALTER TABLE ONLY public.transaction_detail
    ADD CONSTRAINT transaction_detail_pk PRIMARY KEY (id);
 R   ALTER TABLE ONLY public.transaction_detail DROP CONSTRAINT transaction_detail_pk;
       public         postgres    false    209            �
           2606    16457    transaction transaction_pk 
   CONSTRAINT     X   ALTER TABLE ONLY public.transaction
    ADD CONSTRAINT transaction_pk PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.transaction DROP CONSTRAINT transaction_pk;
       public         postgres    false    207            �
           2606    16412    product product_brand_id_fk    FK CONSTRAINT     {   ALTER TABLE ONLY public.product
    ADD CONSTRAINT product_brand_id_fk FOREIGN KEY (brand_id) REFERENCES public.brand(id);
 E   ALTER TABLE ONLY public.product DROP CONSTRAINT product_brand_id_fk;
       public       postgres    false    199    2714    197            "   *   x�3�t���/��tI�,��2��K-.�I�t��O����� �g	�      )      x������ � �      (   .   x�3��S��K,R�J�L��002�T0351�5�0������� ��h      $   F   x�3�4�t���/�T��O/-*Q�M���4350�30�2�4��K-NNLKUpN,((M����4����qqq ��      &   0   x�3��SpJ�K/�SN�+�/N��002�T0]Ss�=... ��
      ,      x������ � �      .      x������ � �     