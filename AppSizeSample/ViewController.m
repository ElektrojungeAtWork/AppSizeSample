//
//  ViewController.m
//  AppSizeSample
//
//  Created by Benjamin Scholtysik on 4/3/18.
//  Copyright © 2018 Microsoft Corp. All rights reserved.
//

#import "ViewController.h"

@import AppCenterAnalytics;
@import AppCenterCrashes;

@interface ViewController ()

@property (weak, nonatomic) IBOutlet UIButton *trackMeButton;
@property (weak, nonatomic) IBOutlet UIButton *crashMeButton;

@end

@implementation ViewController

- (void)viewDidLoad {
  [super viewDidLoad];
  // Do any additional setup after loading the view, typically from a nib.
}


- (void)didReceiveMemoryWarning {
  [super didReceiveMemoryWarning];
  // Dispose of any resources that can be recreated.
}

- (IBAction)trackMe:(id)sender {
  for(int i = 0; i < 300; i++)
    [MSAnalytics trackEvent:@"hello"];
}

- (IBAction)crashMe:(id)sender {
  [MSCrashes generateTestCrash];
}

@end
