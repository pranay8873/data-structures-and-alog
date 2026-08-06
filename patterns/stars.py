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

