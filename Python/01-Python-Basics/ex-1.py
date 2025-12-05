Salary = int(input("Enter Your Salary: "))
Gender = input("Enter Your Gender ('M', 'F'): ").capitalize()

if Gender == 'M' and Salary > 500:
    Salary = Salary + Salary * 10/100

elif Gender == 'M' and Salary <= 500:
    Salary = Salary + Salary * 15/100

elif Gender == 'F' :
    Salary = Salary + Salary * 20/100

else: print("Invalid Input")

print(Salary)

