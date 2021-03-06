package com.example.placement;

public class intern {
    public String company_name, company_id, position, description, cpi_cutoff, branches_allowed, last_day_to_apply,url_of_brochure, imageURL,internID;

    public intern(String company_name, String company_id, String position, String description, String cpi_cutoff, String last_day_to_apply, String branches_allowed, String url, String imageURL, String internID) {
        this.company_name = company_name;
        this.company_id = company_id;
        this.position = position;
        this.description = description;
        this.cpi_cutoff = cpi_cutoff;
        this.last_day_to_apply = last_day_to_apply;
        this.branches_allowed = branches_allowed;
        this.url_of_brochure = url;
        this.imageURL = imageURL;
        this.internID = internID;
    }

    public intern(){ }

    public String getCompany_name() { return company_name; }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCpi_cutoff() {
        return cpi_cutoff;
    }

    public void setCpi_cutoff(String cpi_cutoff) { this.cpi_cutoff = cpi_cutoff; }

    public String getBranches_allowed() { return branches_allowed; }

    public void setBranches_allowed(String branches_allowed) { this.branches_allowed = branches_allowed; }

    public String getLast_day_to_apply() { return last_day_to_apply; }

    public void setLast_day_to_apply(String last_day_to_apply) { this.last_day_to_apply = last_day_to_apply; }

    public String getUrl_of_brochure() { return url_of_brochure; }

    public void setUrl_of_brochure(String url_of_brochure) { this.url_of_brochure = url_of_brochure; }

    public String getImageURL() { return imageURL; }

    public void setImageURL(String imageURL) { this.imageURL = imageURL; }

    public String getInternID() { return internID; }

    public void setInternID(String internID) { this.internID = internID; }
}
