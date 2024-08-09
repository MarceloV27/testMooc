package Archive;

class Archive {


    private String identifier;
    private String name;
    Archive archiveCompare;

    Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier(){
        return identifier;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return this.identifier + ":" + this.name;
    }

    public boolean equals(Object compared){
        if(this.equals(compared)){
            return true;
        }

        if(!(compared instanceof Archive)){
        return false;
        }

          archiveCompare = (Archive) compared;

        if(this.identifier.equals(archiveCompare.getIdentifier()) && this.name.equals(archiveCompare.getName()) ){
            return true;
        }

        return false;
    }

}
