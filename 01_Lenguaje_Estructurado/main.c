#include "funciones.h"

int main(int argc, char const *argv[]){

	fflush(stdin);
	printf("Ingresa el NOMBRE: ");
	gets(persona1.nombre);
	printf("Ingresa el APELLIDO: ");
	gets(persona1.apellido);
	
	printf("Ingresa la EDAD: ");
	scanf("%d", &persona1.edad);
	
	printf("Ingresa el GENERO: ");
	scanf("%1s", &persona1.genero);
	
	printf("\n\n-------------------------------------------------\n\n->DATOS DE LA PERSONA<-\n");
	printf("NOMBRE: %s\nAPELLIDO: %s\nEDAD: %d\nGENERO: %s\n\n", persona1.nombre,persona1.apellido,persona1.edad,persona1.genero);
	hablar();
	saludar();
	caminar();
	comer();
	
	
	
	return 0;
}
