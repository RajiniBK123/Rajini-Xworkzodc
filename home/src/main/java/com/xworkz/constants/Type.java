package com.xworkz.constants;

public enum Type 
{
	APARTMENT("apartment"),
	INDIVIDUAL("indiv"),
	VILLA("villa"),;


		private String value;

		private Type(String value) {
			this.value=value;
		}

		public String getValue() {
			return value;
		}
}
