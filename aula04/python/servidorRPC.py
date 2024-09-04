from xmlrpc.server import SimpleXMLRPCServer

def add(a, b):
    return a + b

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    if y != 0:
        return x / y
    else:
        return "Error: Division by zero is not allowed"
    
def add(x, y):
    return x + y

# Configuração do servidor RPC
server = SimpleXMLRPCServer(("localhost", 8000))
print("Servidor RPC aguardando requisições..")

# Registrando funções para serem chamadas remotamente
server.register_function(add, "add")
server.register_function(subtract, "subtract")
server.register_function(multiply, "multiply")
server.register_function(divide, "divide")

# Mantendo o servidor em execução
server.serve_forever()