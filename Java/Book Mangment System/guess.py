import random

secret_number = random.randint(1, 100)
attempts = 0
guess_history = []

guess = 0

while guess != secret_number:
    guess = int(input("Enter your guess (1-100): "))
    attempts += 1
    guess_history.append(guess)

    if guess < secret_number:
        print("Too low")
    elif guess > secret_number:
        print("Too high")
    else:
        print("Correct")

print("Correct number: ", secret_number)
print("Total attempts: ", attempts)
print("List of all guesses: ", guess_history)