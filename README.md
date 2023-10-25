# Projeto-PIX-Hackathon
Projeto Criado no Hackathon dia 25/10
Utilizando do Spring Boot e PostegreSQL para implementação de API PIX.

Checlist:
POST /api/pix/chaves - Adicionar um usuario e define a key de CPF.
GET /api/pix/chaves/{id} - Obtém as informações do usuário com base no ID.
DELETE /api/pix/chaves/{id} - Delete o usuário.
PUT /api/pix/chaves/{id} - Substitui as chaves (não crasha, mas define tudo como NULL)
