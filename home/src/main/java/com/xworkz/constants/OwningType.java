package com.xworkz.constants;

public enum OwningType 
{
	RENT("rent"),
	LEASE("lease"),
	OWN("own");

	private String value;

		private OwningType(String value) {
			this.value=value;
		}

		public String getValue() {
			return value;
		}
}
