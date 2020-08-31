username = "Kenek"
print(f"Siema, {username}")
flaszka = 49.9
ilosc = 4
print(f"Kierowniku, za {ilosc} flaszki po {flaszka:,.2f} będzie {flaszka*ilosc:,.2f} zeta")
podatek_vat = .02137
print(f'W tym VAT to {podatek_vat:.2%} czyli jakieś {(flaszka * ilosc) * podatek_vat:,.2f} cebulionów')
podatek1=f'VAT to {podatek_vat:.2%}!'
podatek2=f"VAT to {podatek_vat:.2%}!"
podatek3=f"""VAT to {podatek_vat:.2%}!"""
podatek4=f'''VAT to {podatek_vat:.2%}!'''
print(podatek1, podatek2, podatek3, podatek4)
user1="Zdzichu"
user2="Marian"
user3="Adrian"
ludki = f"{username}\n{user1}\n{user2}\n{user3}"
print(ludki)
paragon=f"""
Flaszka {flaszka-(flaszka*podatek_vat):>6,.2f}
VAT     {flaszka*podatek_vat:>6,.2f}
Suma:   {flaszka:>6,.2f}
"""
print(paragon)
#przeformatujemy ze złotóweczkami
flaszka_netto=f"{flaszka-(flaszka*podatek_vat):,.2f}" + " PLN"
flaszka_vat=f"{flaszka*podatek_vat:,.2f}" + "  PLN"
flaszka_pln=f"{flaszka:,.2f}"+ " PLN"
print(f"Flaszka {flaszka_netto:>6}")
print(f"VAT     {flaszka_vat:>6}")
print(f"Suma:   {flaszka_pln:>6}")
print(user1, len(user1))