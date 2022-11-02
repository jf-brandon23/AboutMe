import turtle as t

donny = t.Turtle()
donny.shape("square")

#draw 1 row of green dots 

c=0
y=120
while (y>-250):
    x=-120
    y-=20
    c+=1
    while(x<250):
        x+=21
        c+=1
        donny.penup()
        donny.goto(x,y)
        donny.pendown()
        if (c%2==1):
            donny.color("red")
        else:
            donny.color("black")
        donny.stamp()
        




wn=t.Screen()
wn.mainloop()