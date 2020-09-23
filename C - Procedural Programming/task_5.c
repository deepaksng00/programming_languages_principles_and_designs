#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* ---- Struct to hold a vehicle instance ---- */
struct Vehicle {
	char * make;
	char * model;
	int numOfWheels;
	double price;
};

/* ---- Swap function to swap memory address values ---- */
void swap(struct Vehicle * v1, struct Vehicle * v2) {
	struct Vehicle v1_bak = *v1;
	*v1 = *v2;
	*v2 = v1_bak;
}

/* ---- QuickSort algorithm ---- */
void quickSort(struct Vehicle * items[10], int left, int right) {
	int i, j;
	i = left;
	j = right;
	char * pivot = items[left]->make;

	while(i <= j) {
		for(; (strcmp(items[i]->make, pivot) < 0) && (i < right); i++);
		for(; (strcmp(pivot, items[j]->make) < 0) && (j > left); j--);

		if(i <= j) {
			swap(items[i++], items[j--]);
		}
	}

	if(left < j) {
		quickSort(items, left, j);
	}
	if(i < right) {
		quickSort(items, i, right);
	}
}

int main(void) {
	/* ---- Vehicle instances ---- */
	struct Vehicle v0 = {
		.make = "Tesla",
		.model = "Model 3",
		.numOfWheels = 4,
		.price = 30000
	};	

	struct Vehicle v1 = {
		.make = "Mercedes-Benz",
		.model = "Class A",
		.numOfWheels = 4,
		.price = 23755
	};	

	struct Vehicle v2 = {
		.make = "Mercedes-Benz",
		.model = "A 35 AMG 4MATIC",
		.numOfWheels = 4,
		.price = 35226
	};	

	struct Vehicle v3 = {
		.make = "Tesla",
		.model = "Model X",
		.numOfWheels = 4,
		.price = 81990
	};	

	struct Vehicle v4 = {
		.make = "Nissan",
		.model = "Qashqai",
		.numOfWheels = 4,
		.price = 9800
	};	

	struct Vehicle v5 = {
		.make = "Dacia",
		.model = "Sendero",
		.numOfWheels = 4,
		.price = 10445
	};	

	struct Vehicle v6 = {
		.make = "Ducati",
		.model = "Diavel Carbon",
		.numOfWheels = 2,
		.price = 13995
	};	

	struct Vehicle v7 = {
		.make = "Yamaha",
		.model = "YB",
		.numOfWheels = 2,
		.price = 799
	};	

	struct Vehicle v8 = {
		.make = "Renault",
		.model = "Clio",
		.numOfWheels = 4,
		.price = 17600
	};	

	struct Vehicle v9 = {
		.make = "Alpine",
		.model = "A110",
		.numOfWheels = 4,
		.price = 60376
	};

	/* ---- Array storing all vehicles ---- */
	struct Vehicle * vehicles[10];

	/* ---- Adding all struct instances (vehicles) to array ---- */
	vehicles[0] =  &v0;
	vehicles[1] = &v1;
	vehicles[2] = &v2;
	vehicles[3] = &v3;
	vehicles[4] = &v4;
	vehicles[5] = &v5;
	vehicles[6] = &v6;
	vehicles[7] = &v7;
	vehicles[8] = &v8;
	vehicles[9] = &v9;

	int structSize = sizeof(vehicles) / sizeof(struct Vehicle *);

	printf("Array of vehicles without sorting: \n\n");

	for(int i = 0; i < structSize; i++) {
		printf("Make: %s\n", vehicles[i]->make);
		printf("Model: %s\n", vehicles[i]->model);
		printf("Number of wheels: %i\n", vehicles[i]->numOfWheels);
		printf("Price: %f\n\n", vehicles[i]->price);
	}

	printf("Array of vehicles with sorting: \n\n");
	
	quickSort(vehicles, 0, 9);

	for(int i = 0; i < structSize; i++) {
		printf("Make: %s\n", vehicles[i]->make);
		printf("Model: %s\n", vehicles[i]->model);
		printf("Number of wheels: %i\n", vehicles[i]->numOfWheels);
		printf("Price: %f\n\n", vehicles[i]->price);
	}
}