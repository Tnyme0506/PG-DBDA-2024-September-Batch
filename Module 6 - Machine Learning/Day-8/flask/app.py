from flask import Flask, render_template, request
import pickle

# Load the trained model from the pickle file
with open(r"C:\Users\sucha\Desktop\C-DAC\Module 6 - Machine Learning\Day-8\model.pkl", 'rb') as fr:
    model = pickle.load(fr)

app = Flask(__name__)

@app.route('/', methods=['GET', 'POST'])
def index():
    prediction = None
    if request.method == 'POST':
        try:
            
            att = float(request.form['attendance'])
            thm = float(request.form['theory_marks'])
            sth = float(request.form['study_hours'])
            
            
            inp = [[att, thm, sth]]
            
           
            prediction = model.predict(inp)[0]  # Take the first prediction result
            
        except ValueError:
            prediction = "Invalid input. Please enter numeric values."
    
    
    return render_template('index.html', prediction=prediction)

if __name__ == '__main__':
    app.run(debug=True)
