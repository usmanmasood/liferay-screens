package com.liferay.mobile.screens.base;

/**
 * @author Víctor Galán Grande
 */
public class MediaStoreEvent {

	public MediaStoreEvent(String filePath) {
		this.filePath = filePath;
	}

	public String getFilePath() {
		return filePath;
	}

	private final String filePath;
}
