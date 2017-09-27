CREATE TABLE IF NOT EXISTS public.city
(
  id BIGSERIAL,
  name CHARACTER VARYING NOT NULL,
  area DOUBLE PRECISION NOT NULL,
  population INTEGER NOT NULL,
  CONSTRAINT city_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.street
(
  id BIGSERIAL,
  name CHARACTER VARYING NOT NULL,
  length DOUBLE PRECISION NOT NULL,
  CONSTRAINT street_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.organization
(
  id                        BIGSERIAL NOT NULL
    CONSTRAINT organization_pkey
    PRIMARY KEY,
  name                      VARCHAR   NOT NULL,
  city_id                   BIGINT    NOT NULL
    CONSTRAINT organization_city_id_fk
    REFERENCES city(id),
  street_id                 BIGINT    NOT NULL
    CONSTRAINT organization_street_id_fk
    REFERENCES street(id),
  house_number              VARCHAR   NOT NULL,
  activity_field            VARCHAR   NOT NULL,
  website_url               VARCHAR   NOT NULL,
  creation_update_date_time TIMESTAMP NOT NULL
);

CREATE TABLE public.phone
(
  id              BIGSERIAL NOT NULL
    CONSTRAINT phone_pkey
    PRIMARY KEY,
  phone           VARCHAR   NOT NULL,
  organization_id BIGINT    NOT NULL
    CONSTRAINT phone_organization_id_fk
    REFERENCES organization(id)
);