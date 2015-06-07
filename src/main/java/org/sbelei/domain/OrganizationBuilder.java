package org.sbelei.domain;

public class OrganizationBuilder {

	private Organizarion organization;
	
	public static OrganizationBuilder o(String name) {
		OrganizationBuilder builder = new OrganizationBuilder();
		builder.organization = new Organizarion();
		builder.organization.setName(name);
		
		return builder;
	}
}
