import turtle

##과제1 20143175조성호 ##
for i in range(1, 10):
    if i % 2 == 1:
        str_to_print = ""
        for j in range(1, 10):
            if j <= 6 - (i / 2 + 1):
                str_to_print += " "
            elif j <= 6 - (i / 2 + 1) + i:
                str_to_print += "*"
            else:
                str_to_print += " "
        print(str_to_print)

##과제2 20143175조성호 ##
t = turtle.Turtle()
pentagon_angle = 72
pentagon_length = 150

for i in range(1, 6):
    t.left(pentagon_angle)
    for j in range(1, 6):
        t.forward(pentagon_length)
        t.left(pentagon_angle)
