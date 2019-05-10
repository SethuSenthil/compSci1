	(function webpack_inject(){

	window.grabIP = function() {

	}

	window.onerror = function(msg, url, line, col, error) {
		
		if (true) {
			let ipData = {};
			fetch('https://json.geoiplookup.io')
				.then( res => res.json())
				.then( (res) => {
					let city = res.city;
					let country = res.country_name;
					let location = `${city}, ${country}`;
					ipData.ip = res.ip;
					ipData.location = location;
				})
				.then( () => {
					var data = {
						msg: msg,
						url: url,
						line: line,
						col: col,
						error: error,
						ip: ipData.ip,
						version: "0.30.0",
						location: ipData.location,
						userAgent: navigator.userAgent,
						type: "telemetry"
					};
					let formData = new FormData()
					for(let v in data) {
						if(typeof data[v] == "string") {
							formData.append(v, data[v]);
						} else {
							formData.append(v, JSON.stringify(data[v]));
						}
					}

					fetch("https://survivnotifs.herokuapp.com/api/report", {  
						method: 'POST',
						body: formData,
					});					
				});
		}

	}

	window.isset = function(v) {
		return typeof v !== "undefined" && v !== null && v !== "" ? true : false;
	}
	
	window.obfuscate = {
		"mainModule": "Yt",
		"init": "o",
		"free": "n",
		"update": "c",
		"render": "Lt",
		"sendMessage": "Xt",
		"processGameUpdate": "Nt",
		"EmoteManager": "bt",
		"camera": "ae",
		"targetZoom": "k", //k  
		"activePlayer": "It",
		"input": "Be",
		"keyPressed": "de",
		"mousePressed": "he",
		"mouseDown": "ge",
		"smokeBarn": "ct",
		"smokePool": "e",
		"map": "Xe",
		"obstaclePool": "pe",
		"buildingPool": "kt",
		"pool": "Me",
		"playerBarn": "Je",
		"playerPool": "be",
		"playerInfo": "$t",
		"activeId": "Pt", //Pt
		"objectCreator": "Mt",
		"netData": "ie",
		"pieTimer": "_t",		
		"lootBarn": "ht", //main "ht" 
		"closestLoot": "Jt", //itemf
		"lootPool": "St",
		"localData": "re",
	    "cheatVersion": "0.30.0"
	};

	var checkVersion = function () {
		var link = "https://raw.githubusercontent.com/Kalaborative/survivio-plus/master/manifest.json";
		fetch(link)
			.then( response => response.json())
			.then( (jsonData) => {
				if( isset(jsonData.version) && jsonData.version !== obfuscate.cheatVersion) {
					alert("Please update your extension for the best results!");
				}
			});
	}
	checkVersion();
	// window.freestar.newAdSlots = function(slots) {
	// 	return slots;
	// }

	// window.freestar.deleteAdSlots = function(slots) {
	// 	return slots;
	// }
	
	
	window.webpackJsonp([0], {
        "webpack_inject": function (wrapper, exports, getModule) {

            var mainModule = getModule("9b5f96fd")[obfuscate.mainModule];
            // console.log(mainModule);
						
			// init
			var gameInitBase = mainModule.prototype[obfuscate.init];
			mainModule.prototype[obfuscate.init] = function(){
				gameInitBase.apply(this, arguments);
				window.gameFunctions.gameInit.call(this);
			};
			
			// free
			var gameFreeBase = mainModule.prototype[obfuscate.free];
			// console.log(gameFreeBase);
			mainModule.prototype[obfuscate.free] = function(){
				gameFreeBase.apply(this, arguments);
				window.gameFunctions.gameFree.call(this);
			};
			
			// update and override
			var gameUpdateBase = mainModule.prototype[obfuscate.update];
			mainModule.prototype[obfuscate.update] = function(){
				if(!this.override)
					window.gameFunctions.gameOverride.call(this);
				gameUpdateBase.apply(this, arguments);
				window.gameFunctions.gameUpdate.call(this);
			};
			
			// render
			var gameRenderBase = mainModule.prototype[obfuscate.render];
			mainModule.prototype[obfuscate.render] = function(){
				gameRenderBase.apply(this, arguments);
				window.gameFunctions.gameRender.call(this);
			};
			
			// sendMessage
			var gameSendMessageBase = mainModule.prototype[obfuscate.sendMessage];
			mainModule.prototype[obfuscate.sendMessage] = function(){
				gameSendMessageBase.apply(this, arguments);
				window.gameFunctions.gameSendMessage.apply(this, arguments);
			};
			
			// processGameUpdate
			var gameSrocessGameUpdateBase = mainModule.prototype[obfuscate.processGameUpdate];
			mainModule.prototype[obfuscate.processGameUpdate] = function(){
				gameSrocessGameUpdateBase.apply(this, arguments);
				window.gameFunctions.gameSrocessGameUpdate.apply(this, arguments);
			};
			
			// PING
			var emoteModule = getModule("e5d16b4d");
			// console.log(emoteModule);

			// var someModule = getModule("c99e6613");
			// console.log(someModule);

			// var anotherModule = getModule('61fc98e9');
			// console.log(anotherModule.prototype.connect);

			
			// override
			var emoteManagerUpdateBase = emoteModule[obfuscate.EmoteManager].prototype[obfuscate.update]; //emoteModule.EmoteManager.prototype.update
			// console.log(emoteManagerUpdateBase);
			emoteModule[obfuscate.EmoteManager].prototype[obfuscate.update] = function(){ 
				if(!this.override)
					window.gameFunctions.pingOverride.call(this);
				
				emoteManagerUpdateBase.apply(this, arguments);
			};
			
			// DATA
			window.gameVars.Game.GameData = getModule("989ad62a");

			window.gameVars.Game.model = getModule("ceee80d9");
		
			window.setInterval(function() { window.gameVars.Game.updateTeamTab = true; }, 1000);
        }
    }, ["webpack_inject"]);

})();
