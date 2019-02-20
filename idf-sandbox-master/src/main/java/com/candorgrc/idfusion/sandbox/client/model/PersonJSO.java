package com.candorgrc.idfusion.sandbox.client.model;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Native <b>Person JavaScript Object</b> marker class providing the means for
 * consuming JSON sources in Java world.
 * <p>
 * <p>
 * Setting <code>isNative = true</code> will tell GWT not to generate any code,
 * as the contract it is fulfilled by JavaScript objects available in native
 * environment.
 * <p>
 * <p>
 * Setting <code>name = "Object"</code> will tell GWT that this has no clear
 * prototype, it inherits from the built-in object in the browser.
 * <p>
 * <p>
 * Setting <code>namespace = JsPackage.GLOBAL</code> will make
 * {@link VehicleJSO} available in the global JavaScript object namespace.
 *
 * @author bp
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class PersonJSO {

	/* Properties */

	@JsProperty
	public native double getId();

	@JsProperty
	public native void setId(double id);

	@JsProperty
	public native String getTitle();

	@JsProperty
	public native void setTitle(String value);

	@JsProperty(name = "first_name")
	public native String getFirstName();

	@JsProperty(name = "first_name")
	public native void setFirstName(String value);

	@JsProperty(name = "last_name")
	public native String getLastName();

	@JsProperty(name = "last_name")
	public native void setLastName(String value);

	@JsProperty
	public native String getSuffix();

	@JsProperty
	public native void setSuffix(String value);

	@JsProperty
	public native String getGender();

	@JsProperty
	public native void setGender(String value);

	@JsProperty
	public native String getRace();

	@JsProperty
	public native void setRace(String value);

	@JsProperty
	public native String getLanguage();

	@JsProperty
	public native void setLanguage(String value);

	@JsProperty
	public native String getUniversity();

	@JsProperty
	public native void setUniversity(String value);

	@JsProperty
	public native String getBuzzword();

	@JsProperty
	public native void setBuzzword(String value);

	@JsProperty
	public native String getEmail();

	@JsProperty
	public native void setEmail(String value);

	@JsProperty(name = "job_title")
	public native String getJobTitle();

	@JsProperty(name = "job_title")
	public native void setJobTitle(String value);

	@JsProperty(name = "linkedin_skill")
	public native String getLinkedinSkill();

	@JsProperty(name = "linkedin_skill")
	public native void setLinkedinSkill(String value);

	@JsProperty
	public native String getAvatar();

	@JsProperty
	public native void setAvatar(String value);

	@JsProperty
	public native String getCompany();

	@JsProperty
	public native void setCompany(String value);

	@JsProperty
	public native String getDepartment();

	@JsProperty
	public native void setDepartment(String value);

	/**
	 * 
	 * @return {@link String} as Employer Identification Number
	 */
	@JsProperty
	public native String getEin();

	/**
	 * 
	 * @param value
	 *            {@link String} as Employer Identification Number
	 */
	@JsProperty
	public native void setEin(String value);

	/**
	 * Transient property - will be neither persisted, nor wired.
	 */
	private transient String action;

	@JsOverlay
	public final String getAction() {
		return action;
	}

	@JsOverlay
	public final void setAction(String action) {
		this.action = action;
	}

	/* convenience methods */

	/**
	 * Constructor like method.
	 * 
	 * @param id
	 * @param title
	 * @param firstName
	 * @param lastName
	 * @param suffix
	 * @param gender
	 * @param race
	 * @param language
	 * @param university
	 * @param buzzword
	 * @param email
	 * @param jobTitle
	 * @param linkedinSkill
	 * @param avatar
	 * @param company
	 * @param department
	 * @param ein
	 * @return {@link PersonJSO} instance
	 */
	@JsOverlay
	public final PersonJSO with(double id, String title, String firstName, String lastName, String suffix, String gender, String race, String language, String university,
			String buzzword, String email, String jobTitle, String linkedinSkill, String avatar, String company, String department, String ein) {
		setId(id);
		setTitle(title);
		setFirstName(firstName);
		setLastName(lastName);
		setSuffix(suffix);
		setGender(gender);
		setRace(race);
		setLanguage(language);
		setUniversity(university);
		setBuzzword(buzzword);
		setEmail(email);
		setJobTitle(jobTitle);
		setLinkedinSkill(linkedinSkill);
		setAvatar(avatar);
		setCompany(company);
		setDepartment(department);
		setEin(ein);

		return this;
	}

}
