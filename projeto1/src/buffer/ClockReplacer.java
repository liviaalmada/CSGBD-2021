package buffer;

import storage.Page;

public class ClockReplacer extends Replacer{
	
	ClockReplacer(int num_pages) {
		
	}

	ClockReplacer() {
		
	}

	@Override
	public Page victim() {
		return null;
	}
}
