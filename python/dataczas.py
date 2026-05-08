import datetime as dt
#TODO zastąpić starą bibliotekę
from dateutil.tz import gettz
dzisiaj = dt.date.today()
print(dzisiaj)
sylwester=dt.date(2019,12,31)
print(sylwester)
print(sylwester.day)
print(sylwester.month)
print(sylwester.year)
print(f"{sylwester:%A, %B %d, %Y}")
dzisiaj_f=f"{dzisiaj:%m/%d/%Y}"
print(dzisiaj_f)
print(f"{dzisiaj:%x}")
print(f"{dzisiaj:%m-%d-%y}")
print(f"Dzisiaj jest {dzisiaj:%A %B %d}")
print(f"{dzisiaj:%A %B %d} jest {dzisiaj:%j} dniem roku {dzisiaj:%Y}")
czas=dt.time()
print(czas)
print(type(czas))
czas=dt.time(23,59,59,999999)
print(czas)
print(f"{czas:%I:%M %p}")
print(f"{czas:%H:%M:%S i %f milisekund}")
print(f"{czas:%X}")
teraz = dt.datetime.now()
print(teraz)
nowy_rok=dt.datetime(2019,12,31,23,59)
print(nowy_rok)
print(f"{nowy_rok:%A, %B %d równo o %I:%M%p}")
print(f"{nowy_rok:%m/%d/%y równo o %H:%M}")
print(f"{nowy_rok:%I:%M %p dnia %b %d}")
print(f"{nowy_rok:%x}")
print(f"{nowy_rok:%c}")
print(f"{nowy_rok:%m/%d/%y dnia %I:%M %p}")
print(f"{nowy_rok:%I:%M %p dnia %m/%d/%y}")
kacowy=dt.date(2020,1,1)
urodzny_agi=dt.date(2020,4,10)
pomiedzy=urodzny_agi-kacowy
print(pomiedzy)
print(type(pomiedzy))
#strona 116
start_time = dt.datetime(2019, 3, 31, 8, 0, 0)
finish_time = dt.datetime(2019, 3, 31, 14, 34, 45)
time_between = finish_time - start_time
print(time_between)
print(type(time_between))
now = dt.datetime.now()
birthdatetime = dt.datetime(1985, 11, 29, 10, 24)
age = now - birthdatetime
print(age)
print(type(age))
#strona 120
utc_now = dt.datetime.utcnow()
roznica = (now - utc_now)
print(f"Czas lokalny:\t{now:%I%M %p}")
print(f"Czas UTC:\t{utc_now:%I%M %p}")
print(f"Różnica:\t{roznica}")
zdarzenie = dt.datetime(2020,7,4,19,0,0)
czas_utc = dt.datetime.now(gettz('Etc/UTC'))
print(f"Czas i data UTC:\t{czas_utc:%A %D %I:%M %p %Z}")
czas_eastcoast = dt.datetime.now(gettz('America/New_York'))
print(f"Czas na wsch wybrzeżu:\t{czas_eastcoast:%A %D %I:%M %p %Z}")
czas_czikago = dt.datetime.now(gettz('America/Chicago'))
print(f"Tymczasem w Czikago:\t{czas_czikago:%A %D %I:%M %p %Z}")
czas_gory_usa = dt.datetime.now(gettz('America/Boise'))
print(f"Czas w górach USA:\t{czas_gory_usa:%A %D %I:%M %p %Z}")
czas_westcoast = dt.datetime.now(gettz('America/Los_Angeles'))
print(f"Czas na Łestkołst:\t{czas_westcoast:%A %D %I:%M %p %Z}")
# Show local date and time
print("Local: " + f"{zdarzenie:%D %I:%M %p %Z}" + "\n")
print(zdarzenie.astimezone(gettz("Etc/UTC")))
print(zdarzenie.astimezone(gettz("America/New_York")))
print(zdarzenie.astimezone(gettz("America/Chicago")))
print(zdarzenie.astimezone(gettz("America/Boise")))
print(zdarzenie.astimezone(gettz("America/Los_Angeles")))
warunek = True
if warunek == True :
	print("Prawda!")
else :
	print("Fałsz!")
warunek = False
if warunek == True :
	print("Prawda!")
else :
	print("Fałsz!")

if (now.hour < 12) and (now.hour >=1):
	print("gu moron")
elif (now.hour >= 12) and (now.hour <18):
	print("Gud afternun")
elif (now.hour >= 18) and (now.hour <22):
	print("Dobry wecer")
elif (now.hour >= 22) and (now.hour  >1):
	print("Idź spać!")
elif (now.hour >= 1) and (now.hour < 12):
	print("Yyyyy")
else :
	print("Zjebałeś")
