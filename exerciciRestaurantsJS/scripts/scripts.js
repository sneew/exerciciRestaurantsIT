function imprimir(){
	// Fase1
	var b5 = 0, b10 = 0, b20 = 0, b50 = 0, b100 = 0, b200 = 0, b500 = 0, price = 0;
	var menu = new Array(5);
	var arrPrices = new Array(5);
	var contP = 1;
	
	// Fase2
	for (let i = 0; i < menu.length; i++) {
		var m = prompt("Introdueix el plat nº"+ contP );
		var aP = prompt("Introdueix el preu del plat nº"+ contP);
		
		menu[i] = m;
		arrPrices[i] = aP;
		contP++;
	}
	
	for (var i = 0; i < menu.length; i++) {
		document.write("el plat "+ i +" és " + menu[i] + "</br>");
		document.write(" i el seu preu és de " + arrPrices[i] + "</br>");
	}
	
	var arrEat = new Array();
	var moreFood = 1;
	
	while (moreFood==1) {
		var eat = prompt("Què vols per menjar?");
		
		arrEat.push(eat);
		
		moreFood = prompt("Vol seguir demanant menjar? Escriu 1 si és que sí i 0 si és que no.");
	}
	
	// Fase3
	var aE;
	var m;
	var isIn = true;
	
	for (let i = 0; i < arrEat.length; i++) {
		aE = arrEat[i];
		for(let j = 0; j < menu.length; j++) {
			m = menu[j];
			if (aE==m) {
				isIn = true;
				price += parseInt(arrPrices[j]);
				break;
			} else {
				isIn = false;
			}
		}
		if (!isIn) {
			document.write(" el plat " + aE + " que ha demanat no existeix </br>");
		}
	}
	document.write("La factura puja als : " + price + "€.- </br>");
	do {
		if (price >= 500) {
			b500 += 1;
			price-=500;
		} else if (price >= 200 && price < 500) {
			b200 += 1;
			price-=200;
		} else if (price >= 100 && price < 200) {
			b100 += 1;
			price-=100;
		} else if (price >= 50 && price < 100) {
			b50 += 1;
			price-=50;
		} else if (price >= 20 && price < 50) {
			b20 += 1;
			price-=20;
		} else if (price >= 10 && price < 20) {
			b10 += 1;
			price-=10;
		} else if (price >= 5 && price < 10) {
			b5 += 1;
			price-=5;
		} 
	} while (price > 0);
	
	document.write("I l'haurà de pagar amb els següents bitllets : "	+ b500 + " bitllet/s de 500€, </br>"
																		+ b200 + " bitllet/s de 200€, </br>"
																		+ b100 + " bitllet/s de 100€, </br>"
																		+ b50 + " bitllet/s de 50€, </br>"
																		+ b20 + " bitllet/s de 20€, </br>"
																		+ b10 + " bitllet/s de 10€, </br>"
																		+ b5 + " bitllet/s de 5€, </br>");
}
