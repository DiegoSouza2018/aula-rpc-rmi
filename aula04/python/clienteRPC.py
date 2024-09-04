import xmlrpc.client as client

# Conectando ao servidor
server = client.ServerProxy("http://localhost:8000")

# Chamadas de procedimento remoto
print("Soma: 10 + 5 = ", server.add(10, 5))
print("Subtração: 10 - 5 = ", server.subtract(10, 5))
print("Multiplicação: 10 * 5 = ", server.multiply(10, 5))
print("Divisão: 10 / 5 = ", server.divide(10, 5))
print("Divisão: 10 / 0 = ", server.divide(10, 0))
