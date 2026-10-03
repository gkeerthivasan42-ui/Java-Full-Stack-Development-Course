import speech_recognition as sr
import os

r = sr.Recognizer()

with sr.Microphone() as source:
    print("Listening...")
    audio = r.record(source, duration=4)

query = r.recognize_google(audio, language="en-in")
print("User said:", query)

# Play song
song = r"D:\Java-Full-Stack-Development-Course\AI\Songs\\" + query + ".mp3"

# Play video
video = r"D:\Java-Full-Stack-Development-Course\AI\videos\\" + query + ".mp4"

if os.path.exists(song):
    os.startfile(song)
elif os.path.exists(video):
    os.startfile(video)
else:
    print("File not found!")