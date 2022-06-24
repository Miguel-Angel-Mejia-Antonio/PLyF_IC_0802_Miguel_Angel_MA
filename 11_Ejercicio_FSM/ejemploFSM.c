//Cabeceras
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <windows.h>

//Se definen los estados de la maquina FSM
#define GO_NORTE 1
#define WAIT_NORTE 2
#define GO_ESTE 3
#define WAIT_ESTE 4

int main(){

	int i;
	//Pila de eventos para nuestro switch.
	int pila_eventos[8]={00,11,00,10,10,10,11,11};
	
	//Estado inicial de nuestro maquina FSM.
	int estado = GO_ESTE;
	
	//printf("ESTADO INICIAL: ====> goNORTE / 3s\n\n");
	Sleep(2000);
	
	//Usamos un for para recorrer cada estado que se tenga en nuestra pila de eventos.
	for(i = 0; i < 8 ; i++){
		//Usamos un Switch para comprobar el estado en cada reiteracion de acuerdo a los eventos.
        switch(estado){

			//Caso referente al estado goNORTE
			case GO_NORTE:
				if(pila_eventos[i] == 00 || pila_eventos[i] == 10){
					printf("Mismo estado goNORTE / 3s\n");
					estado=GO_NORTE; //Actualizamos el estado a goNORTE
				}else if(pila_eventos[i] == 01 || pila_eventos[i] == 11){
					printf("Llendo a ==> waitNORTE / 2s\n");
					estado=WAIT_NORTE; //Actualizamos el estado a waitNORTE
				}else{
                    //printf("No existe ese estado\n");
				}
				system("pause");
				break;
				
            //Caso referente al estado waitNORTE
			case WAIT_NORTE:
                if(pila_eventos[i] == 00 || pila_eventos[i] == 01 || pila_eventos[i] == 10 || pila_eventos[i] == 11){
					printf("Llendo a ==> goESTE / 3s\n");
					estado = GO_ESTE; //Actualizamos el estado a goESTE
                }else{
                }
                system("pause");
                break;
                
            //Caso referente al estado goESTE
			case GO_ESTE:
                if(pila_eventos[i] == 00 || pila_eventos[i] == 01){
					printf("Mismo estado goESTE / 3s\n");
					estado=GO_ESTE; //Actualizamos el estado a goESTE
                }else if(pila_eventos[i] == 10 || pila_eventos[i] == 11){
					printf("Llendo a ==> waitESTE / 2s\n");
					estado=WAIT_ESTE; //Actualizamos el estado a waitESTE
				}

                system("pause");
                break;
                
			//Caso referente al estado waitESTE
            case WAIT_ESTE:
                if(pila_eventos[i] == 00 || pila_eventos[i] == 01 || pila_eventos[i] == 10 || pila_eventos[i] == 11){
					printf("Llendo a ==> goNORTE / 3s\n");
					estado = GO_NORTE; //Actualizamos el estado a goNORTE
                }
                system("pause");
                break;

			//Caso por defecto
			default:
			break;
		}
	}
	
	return 0;
}
