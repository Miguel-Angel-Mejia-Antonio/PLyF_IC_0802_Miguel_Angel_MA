#include<stdint.h>
#include<stdio.h>
#include<math.h>
#include<stdint.h>

int main(){
	//char binario[16]={'0','0','0','1','1','0','0','1','1','0','1','1','0','0','0','0'};
	//int16_t binario;
	char binario[2];
	binario[0]=00011001;
	binario[1]=10110000;
	int numbinario[8],numbinario2[4];
	int enteros=0;
	
	printf("INTRODUCE EL NUMERO BINARIO(16): ");
	scanf("%16s",binario);
	int i;
	int b=-1;
	for(i=7;i>=0;i=i-1){
		b++;
		switch(binario[b])
		{
			case '0':
				numbinario[i]=0;
			break;
			case '1':
				numbinario[i]=1;
			break;
		}
		enteros=numbinario[i]*pow(2,i)+enteros;
	}
	//printf("\nDECIMAL %d",decimal);
	
	//DECIMALES
	float decimales;
	int x,y=7;
		for(x=0;x<4;x++){
			y++;
			switch(binario[y]){
				case '0':
					numbinario2[x]=0;
				break;
				case '1':
					numbinario2[x]=1;
				break;
			}
		}
	decimales=(0.5*numbinario2[0])+(0.25*numbinario2[1])+(0.125*numbinario2[2])+(0.0625*numbinario2[3]);
	printf("\nRESULTADO: %.4f\n\n",enteros+decimales);
	
	return 0;
}
