package modelo;

public class Usuario {
    
    private String dni;
    private String correo;
    private String password;
    private String nombre;
    private String apellidos;
    private String rol;
    
    //Para las preferencias
    private double peso;
    private double altura;
    private int edad;
    private String sexo;
    private String nivel;
    private int frecuencia;
    private double calmin;
    private double calmax;
    
    //Segun la formula de Mifflin-St Jeor   
    public double calculaCaloriasPorDia(String gen) {
        double calxdia=0;
        switch(gen) {
            case "M":
                calxdia = 10 * peso + 6.25 * altura - 5 * edad + 5;
                break;
            case "F":
                calxdia = 10 * peso + 6.25 * altura - 5 * edad - 161;
                break;
        }

        return calxdia;
    }
    
    //Calcular minimo y maximo de calorias por semana del almuerzo
    public void calcularCaloriasPorSemana(double calxdia){
        double caltotal = 7 * (calxdia * 0.30) ; //Suponiendo que el amuerzo representa el 30% de las cal por dia
        //Calculando un margen del -+10% para el minimo y maximo
        calmin = 0.90 * caltotal;
        calmax = 1.10 * caltotal;
    }
    
    
    public double calculaCaloriasPorDia2(String gen, int edad2 , double peso2, double altura2) {
        double calxdia=0;
        switch(gen) {
            case "M":
                calxdia = 10 * peso2 + 6.25 * altura2 - 5 * edad2 + 5;
                break;
            case "F":
                calxdia = 10 * peso2 + 6.25 * altura2 - 5 * edad2 - 161;
                break;
        }

        return calxdia;
    }
            
    public Usuario() {
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getCalmin() {
        return calmin;
    }

    public void setCalmin(double calmin) {
        this.calmin = calmin;
    }

    public double getCalmax() {
        return calmax;
    }

    public void setCalmax(double calmax) {
        this.calmax = calmax;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
