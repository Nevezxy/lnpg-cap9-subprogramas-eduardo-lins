def ler_produto():
    nome = input("Produto: ")
    quantidade = int(input("Quantidade: "))
    preco = float(input("Preço: "))
    return nome, quantidade, preco


def calcular_subtotal(quantidade, preco):
    return quantidade * preco


def calcular_desconto(subtotal):
    if subtotal > 500:
        return subtotal * 0.10

    if subtotal > 200:
        return subtotal * 0.05

    return 0


def calcular_total(subtotal, desconto):
    return subtotal - desconto


def imprimir_cupom(nome, subtotal, desconto, total):
    print("Produto:", nome)
    print("Subtotal:", subtotal)
    print("Desconto:", desconto)
    print("Total:", total)


nome, quantidade, preco = ler_produto()

subtotal = calcular_subtotal(quantidade, preco)
desconto = calcular_desconto(subtotal)
total = calcular_total(subtotal, desconto)

imprimir_cupom(nome, subtotal, desconto, total)