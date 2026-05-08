import random
guess=''
while guess not in ('heads','tails'):
        print('Guess the coin toss!')
        guess=input()
toss = random.randint(0,1)
if guess=='tails':
        guess=int(0)
else:
        guess=int(1)
if toss == guess:
        print('You got it')
else:
        print('Nope! Guess again.')
        guess=input()
        if toss == guess:
                print('You got it!')
        else:
                print('Nope. You suck.')
