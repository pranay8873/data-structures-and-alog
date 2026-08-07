# for i in range (4):
#     for j in range (4):
#         print("*",end="") #print s.ment by default consists of \n at the end of print fun ,end="" removes that \n
#                         #    ie;print=>print("xxxx",end="\n")
#     print("\n")
#start pyramid pattern
def pattern(a):
    for i in range(a):
        #space
        for j in range(a-i-1):
            print(" ",end="")


        #stars
        for j in range(i*2+1):
            print("*",end="")



        #space
        for j in range(a-i-1):
                print(" ",end="")
        print("\n")
a=int(input("enter a integer:"))
pattern(a)

def rev_pyramid(a):
     for i in range(a):
          #space
          for j in range(i):
               print(" ",end="")
          #stars
          for j in range(2*a-(2*i+1)):
                print("*",end="")
          #space
          for j in range(i):
                print(" ",end="")   
          print("\n")
rev_pyramid(a)

def diamond(a):
    pattern(a)
    rev_pyramid(a)
print("diamond pattern")
diamond(a)

def arrow_head(a):
    i=1
    for i in range(2*a-1):
        star=i
        if (i>a):
             star=2*a-i
        for j in range(star):
            print("*",end="")
        print("\n")
print("arrow head pattern")
arrow_head(a)
#right angle triangle with 0 and 1
def right_angle_triangle(a):
     var=1
     for i in range(a):
          if(i%2==0):
             var=1
          else:
              var=0
          for j in range(i):
             print(var,end="")
             var=1-var
          print("\n")
               
right_angle_triangle(a)   

#square with hallow traingle
def square_with_hallow_triangle(a):
    for i in range (1,a+1):
         
     #numbers
     for j in range(1,i+1):
        print(j,end="")

     #space
     for j in range((a-i)*2):
        print(" ",end="")


     #numbers
     for j in range(i,0,-1):
        print(j,end="")
     print("\n")
print("square with hallow traingle pattern")
square_with_hallow_triangle(a)