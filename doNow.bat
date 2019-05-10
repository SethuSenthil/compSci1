set /p Build=<c:\Users\10023088\Desktop\comSci1\compSci1\DoNowTemplate\track.txt
echo %Build%
mkdir "C:\Users\10023088\Desktop\comSci1\compSci1\doNow%Build%"
xcopy /s/h c:\Users\10023088\Desktop\comSci1\compSci1\DoNowTemplate\doNow.java c:\Users\10023088\Desktop\comSci1\compSci1\doNow%Build%\ 
xcopy /s/h c:\Users\10023088\Desktop\comSci1\compSci1\DoNowTemplate\.gitignore c:\Users\10023088\Desktop\comSci1\compSci1\doNow%Build%\
@echo off
start TextPad "c:\Users\10023088\Desktop\comSci1\compSci1\doNow%Build%\doNow.java"
start Notepad "c:\Users\10023088\Desktop\comSci1\compSci1\DoNowTemplate\track.txt"

pause