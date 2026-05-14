produto = input("Produto: ")
quantidade = int(input("Quantidade: "))
preco = float(input("Preço: "))

subtotal = quantidade * preco

if subtotal > 500:
    desconto = subtotal * 0.10
elif subtotal > 200:
    desconto = subtotal * 0.05
else:
    desconto = 0

total = subtotal - desconto

print("Produto:", produto)
print("Subtotal:", subtotal)
print("Desconto:", desconto)
print("Total:", total)