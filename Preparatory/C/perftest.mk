perftest: perftest.o myUtils.o myalgos.o
	gcc -o perftest perftest.o myUtils.o myalgos.o -I.

perftest.o: perftest.c myUtils.c myalgos.c
	gcc -c perftest.c myUtils.c myalgos.c 

myUtils.o: myUtils.c
	gcc -c myUtils.c

myalgos.o: myalgos.c
	gcc -c myalgos.c