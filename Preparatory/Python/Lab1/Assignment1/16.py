print "Welcome to user-interactive calculator!!!\nYou can add,multiply and average two numbers..."
print "What do you want to do?Select the option no..."
print "1 Add\n2 Multiply\n3 Average"
option = int(raw_input())
print "Enter first number: "
a = int(raw_input())
print "Enter first number: "
b = int(raw_input())
if option==1:
    print (a+b)
elif option==2:
    print (a*b)
elif option==3:
    print ((a+b)/2.0)
else:
    print "Invalid input!!!"
    


