print "Enter your study year(1,2..5): "
x = int(raw_input())
print "Enter your specialization(CSE or ECE): "
y = raw_input()
if y.lower()=="cse":
	if x==1:
	   print "You're courses are-\nCSE101\nCSE102\nCSE103\nCSE104\nCSE105"
	elif x==2:
	   print "You're courses are-\nCSE201\nCSE202\nCSE203\nCSE204\nCSE205"
	elif x==3:
	   print "You're courses are-\nCSE301\nCSE302\nCSE303\nCSE304\nCSE305"
	elif x==4:
	   print "You're courses are-\nCSE401\nCSE402\nCSE403\nCSE404\nCSE405"
	elif x==5:
	   print "You're courses are-\nCSE501\nCSE502\nCSE503\nCSE504\nCSE505"
	else:
	   print "You're course is over. Go get a job!!!"
elif y.lower()=="ece":
	if x==1:
	   print "You're courses are-\nECE101\nECE102\nECE103\nECE104\nECE105"
	elif x==2:
	   print "You're courses are-\nECE201\nECE202\nECE203\nECE204\nECE205"
	elif x==3:
	   print "You're courses are-\nECE301\nECE302\nECE303\nECE304\nECE305"
	elif x==4:
	   print "You're courses are-\nECE401\nECE402\nECE403\nECE404\nECE405"
	elif x==5:
	   print "You're courses are-\nECE501\nECE502\nECE503\nECE504\nECE505"
	else:
	   print "You're course is over. Go get a job!!!"
else:
	print "No such course exists!!!"
