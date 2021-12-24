1. To run on a linux system when a docker is installed, execute commands:

    - docker run --name postgres -p 5432:5432 -e POSTGRES_PASSWORD=developer -d postgres
    - docker run --rm -p 5050:5050 thajeztah/pgadmin4
    

