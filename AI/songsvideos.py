import tkinter
from tkinter import messagebox
import os
print("all modules ok")
win=tkinter.Tk()
wi=win.winfo_screenwidth()
he=win.winfo_screenheight()
win.configure(width=wi,height=he,bg="pink")
def show1():
    messagebox.showinfo("songs","now playing...")
    os.startfile(r"D:\Java-Full-Stack-Development-Course\AI\videos\1.mp4")
def show2():
    messagebox.showinfo("songs","now playing...")
    os.startfile(r"D:\Java-Full-Stack-Development-Course\AI\videos\2.mp4")
fontsize=('arial',35)
but1=tkinter.Button(text="play ai 1 mp4",command=show1,font=fontsize,fg="white",bg="green")
but1.place(x=300,y=300)
but1=tkinter.Button(text="play ai 2 mp4",command=show2)
but1.place(x=300,y=500)
win.mainloop()