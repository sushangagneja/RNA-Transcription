class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaTranscribedStrand = "";
        for(int i=0;i<dnaStrand.length();i++) {
            String tmp = "";
            switch(dnaStrand.charAt(i)) {
                case 'G': tmp = "C"; break;
                case 'C': tmp = "G"; break;
                case 'T': tmp = "A"; break;
                case 'A': tmp = "U"; break;
            }
            rnaTranscribedStrand = rnaTranscribedStrand + tmp;
        }
        return rnaTranscribedStrand;
    }

}
