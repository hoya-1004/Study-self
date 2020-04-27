# 컴퓨터 공학부 20143175 조성호
# 2.1 과제 (3자리수 입력후 순서 바꾸기)
import turtle

number = int(input("세자리 정수 입력 "))

hun_num = number // 100
ten_num = (number - hun_num * 100) // 10
one_num = number % 10
fin_num = one_num * 100 + ten_num * 10 + hun_num
print("입력한 수의 역순", fin_num)


# 공통과제
t = turtle.Turtle()
length = int(input("변의 길이를 입력하세요"))

t.shape("arrow")

half = length / 2
rightangle = 90

t.circle(half)
t.penup()
t.forward(half)
t.pendown()


t.left(rightangle)
t.forward(length)

t.left(rightangle)
t.forward(length)

t.left(rightangle)
t.forward(length)

t.left(rightangle)
t.forward(length)
