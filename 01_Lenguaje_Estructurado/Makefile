all:
	gcc -g -c -Wall main.c -o main.o
	gcc -g -c -Wall funciones.c -o funciones.o
	gcc -g -Wall main.o funciones.o -o app -l pthread

clean:
	rm *.o
	rm app
