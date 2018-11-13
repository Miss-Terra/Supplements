package com.mycompany.myapp.catagories.neurotransmitters.acetylcholine.anticholinergics;

import com.mycompany.myapp.info.Info;

public interface anticholinergic {
	final Info effect = new Info(
			"Blocks acetylcholine.",
			"https://en.wikipedia.org/wiki/Anticholinergic");
	
	public default String anticholinergic() {
		return effect.get();
	}
}
